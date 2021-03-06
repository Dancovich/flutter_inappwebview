package com.pichillilorenzo.flutter_inappwebview;

public class InAppBrowserOptions extends Options {

    public static final String LOG_TAG = "InAppBrowserOptions";

    public boolean hidden = false;
    public boolean toolbarTop = true;
    public String toolbarTopBackgroundColor = "";
    public String toolbarTopFixedTitle = "";
    public boolean hideUrlBar = false;

    public boolean hideTitleBar = false;
    public boolean closeOnCannotGoBack = true;
    public boolean progressBar = true;

    public boolean hideMenu = false;
    public boolean showToolbarBackButton = false;

    @Override
    public void setValueForField(String field, Object value) {
        switch (field) {
            case "hidden":
                if (value != null) hidden = (boolean) value;
                break;
            case "toolbarTop":
                if (value != null) toolbarTop = (boolean) value;
                break;
            case "toolbarTopBackgroundColor":
                toolbarTopBackgroundColor = value != null ? value.toString() : "";
                break;
            case "toolbarTopFixedTitle":
                toolbarTopFixedTitle = value != null ? value.toString() : "";
                break;
            case "hideUrlBar":
                if (value != null) hideUrlBar = (boolean) value;
                break;
            case "hideTitleBar":
                if (value != null) hideTitleBar = (boolean) value;
                break;
            case "closeOnCannotGoBack":
                if (value != null) closeOnCannotGoBack = (boolean) value;
                break;
            case "progressBar":
                if (value != null) progressBar = (boolean) value;
                break;
            case "hideMenu":
                if (value != null) hideMenu = (boolean) value;
                break;
            case "showToolbarBackButton":
                if (value != null) showToolbarBackButton = (boolean) value;
                break;
        }
    }

    @Override
    public Object getValueForField(String field) {
        switch (field) {
            case "hidden":
                return hidden;
            case "toolbarTop":
                return toolbarTop;
            case "toolbarTopBackgroundColor":
                return toolbarTopBackgroundColor;
            case "toolbarTopFixedTitle":
                return toolbarTopFixedTitle;
            case "hideUrlBar":
                return hideUrlBar;
            case "hideTitleBar":
                return hideTitleBar;
            case "closeOnCannotGoBack":
                return closeOnCannotGoBack;
            case "progressBar":
                return progressBar;
            case "hideMenu":
                return hideMenu;
            case "showToolbarBackButton":
                return showToolbarBackButton;
            default:
                return null;
        }
    }

    @Override
    public String[] getFieldList() {
        return new String[]{
                "hidden",
                "toolbarTop",
                "toolbarTopBackgroundColor",
                "toolbarTopFixedTitle",
                "hideUrlBar",
                "hideTitleBar",
                "closeOnCannotGoBack",
                "progressBar",
                "hideMenu",
                "showToolbarBackButton"
        };
    }
}
