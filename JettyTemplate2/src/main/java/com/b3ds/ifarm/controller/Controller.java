package com.b3ds.ifarm.controller;

import java.io.IOException;

import javax.json.Json;
import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonObject;


@org.springframework.stereotype.Controller
public class Controller {
	
	private final Logger logger = LogManager.getLogger(Controller.class);
	
	
	@RequestMapping("/")
	public String index(HttpServletRequest req)
	{
		return "index.html";
	}
	
	@RequestMapping(value="/info", method=RequestMethod.POST)
	@ResponseBody
	public String information(HttpServletRequest req, @RequestBody String obj) throws JSONException, InterruptedException,IOException
	{
		
		Gson gson = new Gson();
		JsonObject ob = gson.fromJson(obj, JsonObject.class);
		logger.debug(obj);
		return "Info Return";
	}
	
	
	@RequestMapping(value="/Symptoms", method=RequestMethod.POST)
	@ResponseBody
	public String Symptom(HttpServletRequest req, @RequestBody String obj) throws JSONException, InterruptedException, IOException
	{
		Gson gson =new Gson();
		JsonObject ob=gson.fromJson(obj,JsonObject.class);
		logger.debug(obj);
		return "Symtoms sent";
		
		
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------
	@RequestMapping(value="/startStream", method=RequestMethod.POST)
	@ResponseBody
	public String some(HttpServletRequest req, @RequestBody String obj) throws JSONException, InterruptedException, IOException
	{
		Gson gson = new Gson();
		JsonObject ob = gson.fromJson(obj, JsonObject.class);
		logger.debug(ob);
		return "{\"msg\":\"hell\"}";
	}
//----------------------------------------------------------------------------------------------------------------------------------
	
	
}


class Information
{
	public  String name="";
	private int age;
	private String gender="";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Information [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}



//----------------------------------------------------------------------------------------------------------------------------------
class Body {
	int chat_id;
	String text;
	public int getChat_id() {
		return chat_id;
	}
	public void setChat_id(int chat_id) {
		this.chat_id = chat_id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Body [chat_id=" + chat_id + ", text=" + text + "]";
	}
	
}
//----------------------------------------------------------------------------------------------------------------------------------
