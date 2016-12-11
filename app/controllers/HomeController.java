package controllers;


import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

// Import models
import models.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render());
    }

    public Result about() {
        return ok(about.render());
       }

      public Result membership() {
        return ok(membership.render());
       }
       public Result products() {
        return ok(products.render());
       }
      public Result equipment() {
        List<Product> productsList = Product.findAll();
        
        return ok(equipment.render(productsList));
       }
       public Result clothing() {
        return ok(clothing.render());
       }
       public Result supplements() {
        return ok(supplements.render());
       }
       public Result login() {
        return ok(login.render());
       }
       public Result signUp() {
        return ok(signUp.render());
       }


}
