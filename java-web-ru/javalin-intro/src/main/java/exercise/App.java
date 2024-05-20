package exercise;

// BEGIN
import io.javalin.Javalin;
// END

public final class App {

    public static Javalin getApp() {

        // BEGIN
        var javaLin = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });
        javaLin.get("/", ctx -> ctx.result("Welcome to Hexlet!"));
	return javaLin;
	}
        // END

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
