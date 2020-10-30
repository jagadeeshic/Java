import javax.script.*;

public class JSEngine
{
    public static void main(String[] args) throws ScriptException
    {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine se = manager.getEngineByName("nashorn");
        se.eval("print('Hello')");
    }
}