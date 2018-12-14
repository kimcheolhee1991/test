package com.cosmo.ch15;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.biz.common.JsoupTest;

public class Jsoupexam{
public int ytnCrawling(String url,String selector){
    Connection.Response response;
    int count=0;
    try {
       response = Jsoup.connect(url)
             .method(Connection.Method.GET)
             .execute();
       Document doc = response.parse();
       Elements elms =doc.select(selector);
       count=elms.size();
       for(Element elm:elms) {
          Elements elmt=elm.select("dt a");
          System.out.println(elmt.text());

          Elements elmtx=elm.select("dd.text");
          for(Element elmts:elmtx) {
             System.out.println(elmts.text());
          }


          Elements elmdate=elm.select("dd.date");
          System.out.println(elmdate.text());
       }} catch (IOException e) {
          e.printStackTrace();
       }
    return count;
 }
 public static void main(String[] args) {

    JsoupTest t = new JsoupTest();
    String url="http://www.ytn.co.kr/photo/sports_list_9902.html";
    String selector="div#ytn_list_v2014 dl.photo_list";
    int a=t.ytnCrawling(url,selector);
    System.out.println(a+"개 크롤링 성공");

    
    
    String url2="http://www.ytn.co.kr/health_life/health_life_list_011801.html";
    String selector2="div#ytn_list_v2014 dl.news_list_v2014";
    int a2=t.ytnCrawling(url2,selector2);
    System.out.println(a2+"개 크롤링 성공");
 }}
