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
                if (value != null)
                    addShareButton = (boolean) value;
                break;
            case "showTitle":
                if (value != null)
                    showTitle = (boolean) value;
                break;
            case "toolbarBackgroundColor":
                toolbarBackgroundColor = value != null ? value.toString() : "";
                break;
            case "enableUrlBarHiding":
                if (value != null)
                    enableUrlBarHiding = (boolean) value;
                break;
            case "instantAppsEnabled":
                if (value != null)
                    instantAppsEnabled = (boolean) value;
                break;
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
