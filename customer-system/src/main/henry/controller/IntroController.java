package main.henry.controller;

import main.henry.database.MenuDbHelper;
import main.henry.model.MenuItem;
import main.henry.view.Intro;

/**
 * IntroController
 */
public class IntroController extends BaseController {
    @Override
    public void preDrawView() {
        MenuDbHelper menuHelper = new MenuDbHelper();
        menuHelper.insert(new MenuItem().setId(1000).setName("조회").setDescription("조회하기"));
        menuHelper.insert(new MenuItem().setId(1001).setName("삭제").setDescription("삭제하기"));
        menuHelper.insert(new MenuItem().setId(1002).setName("종료").setDescription("종료하기"));

        super.preDrawView();
    }

    @Override
    public void onDrawView() {
        new Intro().drawView();

        super.onDrawView();
    }
}