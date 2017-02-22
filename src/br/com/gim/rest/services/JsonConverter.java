package br.com.gim.rest.services;


import com.google.gson.Gson;

public class JsonConverter {
	
	public static String toJson(Object object){
		return new Gson().toJson(object);
	}
	
}
