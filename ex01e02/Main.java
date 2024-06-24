package ex01e02;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String json = "{\"nome\":\"Diogo\",\"idade\":19,\"cidade\":\"SP\"}";
        //Gson gson = new Gson(); ex 01

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);

    }
}