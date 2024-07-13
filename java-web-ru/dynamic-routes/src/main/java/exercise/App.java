package exercise;

import io.javalin.Javalin;
import java.util.List;
import java.util.Map;

// BEGIN

// END

public final class App {

    private static final List<Map<String, String>> COMPANIES = Data.getCompanies();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });

        // BEGIN
	app.get("/companies/{id}", ctx -> {
            var id = ctx.pathParam("id");
            Map<String, String> results = COMPANIES.stream()
                    .filter(i -> i.get("id").equals(id))
                    .findFirst()
                    .orElse(null);

            if (results==null) {
                throw new NotFoundResponse("Company not found");
            }

            ctx.json(results);
        });
        // END

        app.get("/companies", ctx -> {
            ctx.json(COMPANIES);
        });

        app.get("/", ctx -> {
            ctx.result("open something like (you can change id): /companies/5");
        });

        return app;

    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
