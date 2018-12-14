package com.method.call;

import java.util.*;

public class Ch11collection {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int [] numarr = {1,2,3};
		Ch02Var cv = new Ch02Var();
		
		
		ArrayList<Object> list = new 	ArrayList<Object>();
		
		list.add("aa");
		list.add("bb");
		list.add(11);
		list.add(numarr);
		list.add(cv);
		
		
		for(int i=0; i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
		System.out.println();System.out.println();
		System.out.println(list);
		
		
		System.out.println(list.get(2));
		
		
		
		//int [] arr = (int[])list.get(3);
		//System.out.println(arr.length);
		
		Ch02Var c =(Ch02Var)list.get(4);
		//Ch02Var rr =(Ch02Var)arr[4];
		
		System.out.println();System.out.println();
		
		System.out.printf("%s\n%s", c.point, c.point);
		
		System.out.println(); System.out.println();
		
		
		String str =(String)list.get(1);
		System.out.println(str);
		
		
		int num =(int)list.get(2);
		System.out.println(num);
		
		//----------------------------------------------------
		
		HashSet<String> set = new HashSet<String>();
		set.add("1");
		set.add("2");
		set.add("3");
		
		System.out.println(set);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//for(int i=0; i<set.size();i++) {
		//	
//			set.
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "kch");
		map.put("age", 20);
		map.put("arr", numarr);
		Object chVar = null;
		map.put("cls", chVar);
		
		
		//for(int i=0; i<map.size();i++) {
//			System.out.println(map.get("name"));
		//}
		String mres1 = (String) map.get("name");
		System.out.println(mres1);
		
		int mres2 = (int) map.get("age");
		System.out.println(mres2);
		
		int[] mres3 = (int[]) map.get("numarr");
		System.out.println(mres3);
		
		Ch02Var mres4 = (Ch02Var) map.get(1);
		System.out.println(mres4);

		
		
		// 컬렉션에 컬렉션 담는 연습  중요한 코드	
		ArrayList<HashMap> mlist = new ArrayList<HashMap>();
			
		for(int i=0; i<4;i++) {
			HashMap<String, Object> map1 = new HashMap<String, Object>();
		    map1.put("name","lee"+(i+4));
		    map1.put("age",20+4);
			
		    mlist.add(map1);
	
		   
		}  
		 System.out.println("총회원수:"+mlist.size());
			
		 
		 HashMap hm = mlist.get(0);
		 hm.get("name");
		 System.out.println(hm.get("name"));
		 
		 
		 System.out.println();System.out.println();
		 
		 
		 
		
		HashMap[] hmm = new HashMap[mlist.size()];
		 for(int i=0; i<mlist.size();i++) {
			 
			 
			 hmm[i] = mlist.get(i);
			 
			 
			 System.out.print(hmm[i].get("name")+"\t");
			 System.out.println(hmm[i].get("age"));
			 
			
		 }
			 
		    
//	배열	    arr[0] = "aa";
//		    syso(arr[0]);
//		    
//	리스트	list.add("aa");
//		    lise.get(i);
//		
//	셋	    set.add("aa");
//		    iterator.next()
//		
//	맵    	map.put("k","aa")
//	    	map.get("k");
//		   
		
		
		
		
		}
	}

