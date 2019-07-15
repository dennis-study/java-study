package main.henry.controller;

/**
 * BaseController
 */
public class BaseController {
    public BaseController() {
        preDrawView();
    }

    protected void preDrawView() {
        onDrawView();
    };

    protected void onDrawView() {
        postDrawView();
    };

    protected void postDrawView() {
    };
}