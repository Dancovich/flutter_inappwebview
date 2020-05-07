package com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs;

import com.pichillilorenzo.flutter_inappwebview.Options;

public class ChromeCustomTabsOptions extends Options {

    final static String LOG_TAG = "ChromeCustomTabsOptions";

    public boolean addShareButton = true;
    public boolean showTitle = true;
    public String toolbarBackgroundColor = "";
    public boolean enableUrlBarHiding = false;
    public boolean instantAppsEnabled = false;

    @Override
    public String[] getFieldList() {
        return new String[]{
                "addShareButton",
                "showTitle",
                "toolbarBackgroundColor",
                "enableUrlBarHiding",
                "instantAppsEnabled"
        };
    }

    @Override
    public void setValueForField(String field, Object value) {
        switch (field) {
            case "addShareButton":
                addShareButton = (boolean) value;
            case "showTitle":
                showTitle = (boolean) value;
            case "toolbarBackgroundColor":
                toolbarBackgroundColor = value != null ? value.toString() : "";
            case "enableUrlBarHiding":
                enableUrlBarHiding = (boolean) value;
            case "instantAppsEnabled":
                instantAppsEnabled = (boolean) value;
        }
    }

    @Override
    public Object getValueForField(String field) {
        switch (field) {
            case "addShareButton":
                return addShareButton;
            case "showTitle":
                return showTitle;
            case "toolbarBackgroundColor":
                return toolbarBackgroundColor;
            case "enableUrlBarHiding":
                return enableUrlBarHiding;
            case "instantAppsEnabled":
                return instantAppsEnabled;
            default:
                return null;
        }
    }
}
