package com.he.implementation;

public class AlienLanguageTranslator implements LanguageTranslator{

	public String fromDefaultLanguage(String languageTokens) {
		char[] langTokens = languageTokens.toCharArray();
		
		for (int i = 0; i < langTokens.length; i++) {
			langTokens[i] =(char) (langTokens[i] + 3);
		}
		return new String(langTokens);
	}

	@Override
	public String toDefaultLanguage(String languageTokens) {
		char[] langTokens = languageTokens.toCharArray();
		
		for (int i = 0; i < langTokens.length; i++) {
			langTokens[i] =(char) (langTokens[i] - 3);
		}
		return new String(langTokens);
	}
	
	public static void main(String[] args) {
		AlienLanguageTranslator al = new AlienLanguageTranslator();
		System.out.println(al.fromDefaultLanguage("Java"));
		
		System.out.println(al.toDefaultLanguage("Mdyd"));
	}

}