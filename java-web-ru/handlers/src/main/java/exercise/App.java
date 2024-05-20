package exercise;

import io.javalin.Javalin;

public final class App {

    public static Javalin getApp() {

        // BEGIN
         var javaLin = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });
        javaLin.get("/phones", ctx -> ctx.json(Data.getPhones()));
        javaLin.post("/domains", ctx -> ctx.json(Data.getDomains()));
	return javaLin;
        // END
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
