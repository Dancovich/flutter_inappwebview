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
                hidden = (boolean) value;
            case "toolbarTop":
                toolbarTop = (boolean) value;
            case "toolbarTopBackgroundColor":
                toolbarTopBackgroundColor = value != null ? value.toString() : "";
            case "toolbarTopFixedTitle":
                toolbarTopFixedTitle = value != null ? value.toString() : "";
            case "hideUrlBar":
                hideUrlBar = (boolean) value;
            case "hideTitleBar":
                hideTitleBar = (boolean) value;
            case "closeOnCannotGoBack":
                closeOnCannotGoBack = (boolean) value;
            case "progressBar":
                progressBar = (boolean) value;
            case "hideMenu":
                hideMenu = (boolean) value;
            case "showToolbarBackButton":
                showToolbarBackButton = (boolean) value;
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
