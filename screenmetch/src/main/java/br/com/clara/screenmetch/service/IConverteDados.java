package br.com.clara.screenmetch.service;

public interface IConverteDados {
   <T> T obterDados (String json, Class<T> classe);
}
