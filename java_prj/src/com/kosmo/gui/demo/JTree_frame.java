package com.kosmo.gui.demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreeSelectionModel;

import com.kosmo.db.DBConnect;
import javax.swing.JTree;
import javax.swing.JEditorPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeExpansionEvent;

public class JTree_frame extends JFrame {

	private JPanel contentPanel;
	JTree jTree;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTree_frame frame = new JTree_frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public JTree_frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPanel);
		
		DefaultTreeSelectionModel treeSelectionModel = new DefaultTreeSelectionModel(); 
		treeSelectionModel.setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		
//		**************************************************
//		** JTREE 사용법 **
//		   : node생성  -> 모델생성 -> JTree생성
//		**************************************************
		
		//---------------------------------------------
		//1. node생성: 하드코딩 노드 생성
		//---------------------------------------------
//		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("XE");
//		DefaultMutableTreeNode childNode = null;		
//		 
//		childNode = new DefaultMutableTreeNode("TABLE");
//			childNode.add(new DefaultMutableTreeNode("EMP"));
//			childNode.add(new DefaultMutableTreeNode("DEPT"));
//		rootNode.add(childNode);
//		 
//		childNode = new DefaultMutableTreeNode("View");
//		    childNode.add(new DefaultMutableTreeNode("B1"));
//		    childNode.add(new DefaultMutableTreeNode("B2"));
//	    rootNode.add(childNode);
		
		
		//---------------------------------------------
		//1. node생성: DB값으로 노드 생성
		//---------------------------------------------
		DefaultMutableTreeNode rootNode = dbTreeData();  // <----DB값으로 노드 만들기
		//Connection conn = dbConn();
		
		//---------------------------------------------
		//2. 모델생성
		//---------------------------------------------
		DefaultTreeModel model = new DefaultTreeModel(rootNode);
		
		//---------------------------------------------
		//3. JTree생성
		//---------------------------------------------
		jTree = new JTree(model);	
		jTree.setSelectionModel(treeSelectionModel);	//단일선택만가능하게
		
		
		//선택이벤트
		jTree.addTreeSelectionListener(new TreeSelectionListener() {
			@Override
			public void valueChanged(TreeSelectionEvent e) {
				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)e.getPath().getLastPathComponent();
		        if(selectedNode.isLeaf()) {
		        	System.out.println("선택 노드명:" + selectedNode.getUserObject());
		        }
			}
		});
		//펼침,접힘 이벤트
		jTree.addTreeExpansionListener(new TreeExpansionListener() {
			public void treeCollapsed(TreeExpansionEvent e) {
				System.out.println("jTree 접힘");
				
			}
			public void treeExpanded(TreeExpansionEvent e) {
				System.out.println("jTree 펼쳐짐");
			}
		});
		
		
		
		JScrollPane jScollPane = new JScrollPane(jTree);
		contentPanel.add(jScollPane, BorderLayout.WEST);
		
		
	}
	
	
	 public DefaultMutableTreeNode dbTreeData() {
	    DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("XE");
	    DefaultMutableTreeNode childNode = null;
	    
	    //--------------- DB에서 가져온 테이블 목록
	    childNode = new DefaultMutableTreeNode("Table");
	    DBConnect db = new DBConnect();
	    Connection conn = db.dbConn();
	    String sql = "select tname from tab";
	    PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		    while(rs.next()) {
		    	childNode.add(new DefaultMutableTreeNode(rs.getString("tname")));  
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		rootNode.add(childNode);
		//---------------
	    
	    childNode = new DefaultMutableTreeNode("View");
		    childNode.add(new DefaultMutableTreeNode("B1"));
		    childNode.add(new DefaultMutableTreeNode("B2"));
		rootNode.add(childNode);

	    return rootNode;
	  }
	 
 
	
}


