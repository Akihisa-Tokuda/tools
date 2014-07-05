package Nashorn;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Objects;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

	
public class jsTest1 {
	public static void main(String[] args) throws ScriptException, NoSuchMethodException{
		
	ScriptEngineManager manager = new ScriptEngineManager();
	ScriptEngine engine = manager.getEngineByName("js");
	
	engine.eval("print(1+2);");
	engine.eval("print(Java.type('java.time.LocalDate').now());"); //2014-03-07
	System.out.println(engine.toString());
	System.out.println(Objects.nonNull(engine));

	//JSのファンクション呼び出し
	engine.eval("function hoge(a,b){return a+b;}");
	Invocable invocable = (Invocable) engine;
	Object object = invocable.invokeFunction("hoge", 1, 2);
	System.out.println(object); //3
	
	}
	
}