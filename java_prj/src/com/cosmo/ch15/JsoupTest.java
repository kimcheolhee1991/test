package com.cosmo.ch15;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.ArrayList;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.Connection.Base;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class JsoupTest {
	public int ytnCrawling(String url, String selector) {
		//Connection.class
		//public interface Connection
		
		//Connection$Response.class
		//
		//       interface Response extends Base
		
		
		Connection.Response response;
		int count = 0;
		try {
			response = Jsoup.connect(url)
					.method(Connection.Method.GET)
					.execute();

			System.out.println(response.statusMessage());
			System.out.println(response.statusCode());


			Document doc = response.parse();
			//System.out.println(doc.html());

			ArrayList<YTNVO> list = new ArrayList<YTNVO>();
			Elements elms = doc.select(selector);
			count  = elms.size();

			//conn = db.dbConn();
			for(Element elm : elms) {
				YTNVO vo  = new YTNVO();
				Elements elTitle = elm.select("dt a");
				System.out.println("http://www.ytn.co.kr"+elTitle.attr("href"));
				System.out.println(elTitle.text());

				vo.setUrl("http://www.ytn.co.kr"+elTitle.attr("href"));
				vo.setTitle(elTitle.text());

				Elements elmsContent = elm.select("dd.text");
				for(Element elmCont : elmsContent) {
					System.out.println(elmCont.text());
					vo.setContent(elmCont.text());
				}
				System.out.println();
				list.add(vo);

				//				String sql = "insert into ytn values(ytn_seq.nextval, ?,?,?)";
				//				pstmt = conn.prepareStatement(sql);
				//				pstmt.setString(1,vo.getUrl());
				//				pstmt.setString(2,vo.getTitle());
				//				pstmt.setString(3,vo.getContent());
				//				res = pstmt.executeUpdate();

			}
			//db.dbClose(conn, pstmt);



			//			Elements elms = doc.select
			//				("div#ytn_list_v2014 dl.photo_list dt a");
			//			for(Element elm : elms) {
			//				System.out.println("http://www.ytn.co.kr"
			//						+elm.attr("href"));
			//				System.out.println(elm.text());
			//			}

			//File f = new File("C:\\jp\\workspace_java\\java_prj\\src\\com\\kosmo\\ch15\\crow.txt");

			//			java.lang.Object
			//			java.io.Writer
			//			java.io.OutputStreamWriter
			//			java.io.FileWriter

			//			java.lang.Object
			//			java.io.Writer
			//			java.io.BufferedWriter


			//			java.lang.Object
			//			java.io.OutputStream
			//			java.io.FileOutputStream

			//			OuputStreamWriter 1byte --> 2byte
			//			FileWriter 1byte --> 2byte

			//-----------------------------------
			//			
			//			byte[] byteArr = xxxxx.html().getBytes();
			//			FileOutputStream fos = new FileOutputStream(f);
			//			BufferedOutputStream bos = new BufferedOutputStream(fos);
			//			bos.write(byteArr);
			//			bos.flush();

			//			FileOutputStream fos = new FileOutputStream(f);
			//			OutputStreamWriter osw = new OutputStreamWriter(fos);
			//			BufferedWriter br = new BufferedWriter(osw);
			//			br.write(xxxxx.html());
			//			br.flush();

			//			FileWriter fw = new FileWriter(f);
			//			BufferedWriter br = new BufferedWriter(fw);
			//			br.write(xxxxx.html());
			//			br.flush();


			//			FileOutputStream fos 
			//				= new FileOutputStream(f);
			//			PrintStream out = new PrintStream(fos);
			//			out.println(doc.html());
			//			
			//			System.out.println(doc.html().length());  //222666
			//			System.out.println(f.length()); 			//223869
			//			

			//http://partnerjun.tistory.com/42

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	public static void main(String[] args) {
		JsoupTest soup = new JsoupTest();
		String url = "http://www.ytn.co.kr/photo/photo_list_1406.html";
		String selector="div#ytn_list_v2014 dl.photo_list";
		int res = soup.ytnCrawling(url, selector);
		System.out.println(res + "건 클롤링");


		url = "http://www.ytn.co.kr/photo/sports_list_9901.html";
		selector="div#ytn_list_v2014 dl.photo_list";
		res = soup.ytnCrawling(url, selector);
		System.out.println(res + "건 클롤링");


		url = "http://www.ytn.co.kr/health_life/health_life_list_011801.html";
		selector="div#ytn_list_v2014 dl.news_list_v2014";
		res = soup.ytnCrawling(url, selector);
		System.out.println(res + "건 클롤링");



	}

	class YTNVO {
		private int seq;
		private String url;
		private String title;
		private String content;
		
		public int getSeq() {
			return seq;
		}
		public void setSeq(int seq) {
			this.seq = seq;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
	}
}
