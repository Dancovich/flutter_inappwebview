package com.pichillilorenzo.flutter_inappwebview.InAppWebView;

import android.os.Build;
import android.webkit.WebSettings;

import com.pichillilorenzo.flutter_inappwebview.Options;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static android.webkit.WebSettings.LayoutAlgorithm.NORMAL;

public class InAppWebViewOptions extends Options {

    public static final String LOG_TAG = "InAppWebViewOptions";

    public Boolean useShouldOverrideUrlLoading = false;
    public Boolean useOnLoadResource = false;
    public Boolean useOnDownloadStart = false;
    public Boolean clearCache = false;
    public String userAgent = "";
    public String applicationNameForUserAgent = "";
    public Boolean javaScriptEnabled = true;
    public Boolean debuggingEnabled = false;
    public Boolean javaScriptCanOpenWindowsAutomatically = false;
    public Boolean mediaPlaybackRequiresUserGesture = true;
    public Integer minimumFontSize = 8;
    public Boolean verticalScrollBarEnabled = true;
    public Boolean horizontalScrollBarEnabled = true;
    public List<String> resourceCustomSchemes = new ArrayList<>();
    public List<Map<String, Map<String, Object>>> contentBlockers = new ArrayList<>();
    public Integer preferredContentMode = PreferredContentModeOptionType.RECOMMENDED.toValue();
    public Boolean useShouldInterceptAjaxRequest = false;
    public Boolean useShouldInterceptFetchRequest = false;
    public Boolean incognito = false;
    public Boolean cacheEnabled = true;
    public Boolean transparentBackground = false;
    public Boolean disableVerticalScroll = false;
    public Boolean disableHorizontalScroll = false;
    public Integer textZoom = 100;
    public Boolean clearSessionCache = false;
    public Boolean builtInZoomControls = false;
    public Boolean displayZoomControls = false;
    public Boolean supportZoom = true;
    public Boolean databaseEnabled = false;
    public Boolean domStorageEnabled = true;
    public Boolean useWideViewPort = true;
    public Boolean safeBrowsingEnabled = true;
    public Integer mixedContentMode;
    public Boolean allowContentAccess = true;
    public Boolean allowFileAccess = true;
    public Boolean allowFileAccessFromFileURLs = true;
    public Boolean allowUniversalAccessFromFileURLs = true;
    public String appCachePath;
    public Boolean blockNetworkImage = false;
    public Boolean blockNetworkLoads = false;
    public Integer cacheMode = WebSettings.LOAD_DEFAULT;
    public String cursiveFontFamily = "cursive";
    public Integer defaultFixedFontSize = 16;
    public Integer defaultFontSize = 16;
    public String defaultTextEncodingName = "UTF-8";
    public Integer disabledActionModeMenuItems;
    public String fantasyFontFamily = "fantasy";
    public String fixedFontFamily = "monospace";
    public Integer forceDark = 0; // WebSettings.FORCE_DARK_OFF
    public Boolean geolocationEnabled = true;
    public WebSettings.LayoutAlgorithm layoutAlgorithm;
    public Boolean loadWithOverviewMode = true;
    public Boolean loadsImagesAutomatically = true;
    public Integer minimumLogicalFontSize = 8;
    public Integer initialScale = 0;
    public Boolean needInitialFocus = true;
    public Boolean offscreenPreRaster = false;
    public String sansSerifFontFamily = "sans-serif";
    public String serifFontFamily = "sans-serif";
    public String standardFontFamily = "sans-serif";
    public Boolean saveFormData = true;
    public Boolean thirdPartyCookiesEnabled = true;
    public Boolean hardwareAcceleration = true;
    public Boolean supportMultipleWindows = false;
    public String regexToCancelSubFramesLoading;

    @Override
    public void setValueForField(String field, Object value) {
        switch (field) {
            case "useShouldOverrideUrlLoading":
                useShouldOverrideUrlLoading = (boolean) value;
                break;
            case "useOnDownloadStart":
                useOnDownloadStart = (boolean) value;
                break;
            case "useOnLoadResource":
                useOnLoadResource = (boolean) value;
                break;
            case "clearCache":
                clearCache = (boolean) value;
                break;
            case "userAgent":
                userAgent = (String) value;
                break;
            case "applicationNameForUserAgent":
                applicationNameForUserAgent = (String) value;
                break;
            case "javaScriptEnabled":
                javaScriptEnabled = (boolean) value;
                break;
            case "debuggingEnabled":
                debuggingEnabled = (boolean) value;
                break;
            case "javaScriptCanOpenWindowsAutomatically":
                javaScriptCanOpenWindowsAutomatically = (boolean) value;
                break;
            case "mediaPlaybackRequiresUserGesture":
                mediaPlaybackRequiresUserGesture = (boolean) value;
                break;
            case "minimumFontSize":
                minimumFontSize = (int) value;
                break;
            case "verticalScrollBarEnabled":
                verticalScrollBarEnabled = (boolean) value;
                break;
            case "horizontalScrollBarEnabled":
                horizontalScrollBarEnabled = (boolean) value;
                break;
            case "resourceCustomSchemes":
                //noinspection unchecked
                resourceCustomSchemes = (List<String>) value;
                break;
            case "contentBlockers":
                //noinspection unchecked
                contentBlockers = (List<Map<String, Map<String, Object>>>) value;
                break;
            case "preferredContentMode":
                preferredContentMode = (int) value;
                break;
            case "useShouldInterceptAjaxRequest":
                useShouldInterceptAjaxRequest = (boolean) value;
                break;
            case "useShouldInterceptFetchRequest":
                useShouldInterceptFetchRequest = (boolean) value;
                break;
            case "incognito":
                incognito = (boolean) value;
                break;
            case "cacheEnabled":
                cacheEnabled = (boolean) value;
                break;
            case "transparentBackground":
                transparentBackground = (boolean) value;
                break;
            case "disableVerticalScroll":
                disableVerticalScroll = (boolean) value;
                break;
            case "disableHorizontalScroll":
                disableHorizontalScroll = (boolean) value;
                break;
            case "textZoom":
                textZoom = (int) value;
                break;
            case "clearSessionCache":
                clearSessionCache = (boolean) value;
                break;
            case "builtInZoomControls":
                builtInZoomControls = (boolean) value;
                break;
            case "displayZoomControls":
                displayZoomControls = (boolean) value;
                break;
            case "supportZoom":
                supportZoom = (boolean) value;
                break;
            case "databaseEnabled":
                databaseEnabled = (boolean) value;
                break;
            case "domStorageEnabled":
                domStorageEnabled = (boolean) value;
                break;
            case "useWideViewPort":
                useWideViewPort = (boolean) value;
                break;
            case "safeBrowsingEnabled":
                safeBrowsingEnabled = (boolean) value;
                break;
            case "mixedContentMode":
                mixedContentMode = (int) value;
                break;
            case "allowContentAccess":
                allowContentAccess = (boolean) value;
                break;
            case "allowFileAccess":
                allowFileAccess = (boolean) value;
                break;
            case "allowFileAccessFromFileURLs":
                allowFileAccessFromFileURLs = (boolean) value;
                break;
            case "allowUniversalAccessFromFileURLs":
                allowUniversalAccessFromFileURLs = (boolean) value;
                break;
            case "appCachePath":
                appCachePath = (String) value;
                break;
            case "blockNetworkImage":
                blockNetworkImage = (boolean) value;
                break;
            case "blockNetworkLoads":
                blockNetworkLoads = (boolean) value;
                break;
            case "cacheMode":
                cacheMode = (int) value;
                break;
            case "cursiveFontFamily":
                cursiveFontFamily = (String) value;
                break;
            case "defaultFixedFontSize":
                defaultFixedFontSize = (int) value;
                break;
            case "defaultFontSize":
                defaultFontSize = (int) value;
                break;
            case "defaultTextEncodingName":
                defaultTextEncodingName = (String) value;
                break;
            case "disabledActionModeMenuItems":
                disabledActionModeMenuItems = (int) value;
                break;
            case "fantasyFontFamily":
                fantasyFontFamily = (String) value;
                break;
            case "fixedFontFamily":
                fixedFontFamily = (String) value;
                break;
            case "forceDark":
                forceDark = (int) value;
                break;
            case "geolocationEnabled":
                geolocationEnabled = (boolean) value;
                break;
            case "layoutAlgorithm":
                setLayoutAlgorithm(value);
                break;
            case "loadWithOverviewMode":
                loadWithOverviewMode = (boolean) value;
                break;
            case "loadsImagesAutomatically":
                loadsImagesAutomatically = (boolean) value;
                break;
            case "minimumLogicalFontSize":
                minimumLogicalFontSize = (int) value;
                break;
            case "initialScale":
                initialScale = (int) value;
                break;
            case "needInitialFocus":
                needInitialFocus = (boolean) value;
                break;
            case "offscreenPreRaster":
                offscreenPreRaster = (boolean) value;
                break;
            case "sansSerifFontFamily":
                sansSerifFontFamily = (String) value;
                break;
            case "serifFontFamily":
                serifFontFamily = (String) value;
                break;
            case "standardFontFamily":
                standardFontFamily = (String) value;
                break;
            case "saveFormData":
                saveFormData = (boolean) value;
                break;
            case "thirdPartyCookiesEnabled":
                thirdPartyCookiesEnabled = (boolean) value;
                break;
            case "hardwareAcceleration":
                hardwareAcceleration = (boolean) value;
                break;
            case "supportMultipleWindows":
                supportMultipleWindows = (boolean) value;
                break;
            case "regexToCancelSubFramesLoading":
                regexToCancelSubFramesLoading = (String) value;
                break;
        }
    }

    @Override
    public Object getValueForField(String field) {
        switch (field) {
            case "useShouldOverrideUrlLoading":
                return useShouldOverrideUrlLoading;

            case "useOnDownloadStart":
                return useOnDownloadStart;

            case "useOnLoadResource":
                return useOnLoadResource;

            case "clearCache":
                return clearCache;

            case "userAgent":
                return userAgent;

            case "applicationNameForUserAgent":
                return applicationNameForUserAgent;

            case "javaScriptEnabled":
                return javaScriptEnabled;

            case "debuggingEnabled":
                return debuggingEnabled;

            case "javaScriptCanOpenWindowsAutomatically":
                return javaScriptCanOpenWindowsAutomatically;

            case "mediaPlaybackRequiresUserGesture":
                return mediaPlaybackRequiresUserGesture;

            case "minimumFontSize":
                return minimumFontSize;

            case "verticalScrollBarEnabled":
                return verticalScrollBarEnabled;

            case "horizontalScrollBarEnabled":
                return horizontalScrollBarEnabled;

            case "resourceCustomSchemes":
                return resourceCustomSchemes;

            case "contentBlockers":
                return contentBlockers;

            case "preferredContentMode":
                return preferredContentMode;

            case "useShouldInterceptAjaxRequest":
                return useShouldInterceptAjaxRequest;

            case "useShouldInterceptFetchRequest":
                return useShouldInterceptFetchRequest;

            case "incognito":
                return incognito;

            case "cacheEnabled":
                return cacheEnabled;

            case "transparentBackground":
                return transparentBackground;

            case "disableVerticalScroll":
                return disableVerticalScroll;

            case "disableHorizontalScroll":
                return disableHorizontalScroll;

            case "textZoom":
                return textZoom;

            case "clearSessionCache":
                return clearSessionCache;

            case "builtInZoomControls":
                return builtInZoomControls;

            case "displayZoomControls":
                return displayZoomControls;

            case "supportZoom":
                return supportZoom;

            case "databaseEnabled":
                return databaseEnabled;

            case "domStorageEnabled":
                return domStorageEnabled;

            case "useWideViewPort":
                return useWideViewPort;

            case "safeBrowsingEnabled":
                return safeBrowsingEnabled;

            case "mixedContentMode":
                return mixedContentMode;

            case "allowContentAccess":
                return allowContentAccess;

            case "allowFileAccess":
                return allowFileAccess;

            case "allowFileAccessFromFileURLs":
                return allowFileAccessFromFileURLs;

            case "allowUniversalAccessFromFileURLs":
                return allowUniversalAccessFromFileURLs;

            case "appCachePath":
                return appCachePath;

            case "blockNetworkImage":
                return blockNetworkImage;

            case "blockNetworkLoads":
                return blockNetworkLoads;

            case "cacheMode":
                return cacheMode;

            case "cursiveFontFamily":
                return cursiveFontFamily;

            case "defaultFixedFontSize":
                return defaultFixedFontSize;

            case "defaultFontSize":
                return defaultFontSize;

            case "defaultTextEncodingName":
                return defaultTextEncodingName;

            case "disabledActionModeMenuItems":
                return disabledActionModeMenuItems;

            case "fantasyFontFamily":
                return fantasyFontFamily;

            case "fixedFontFamily":
                return fixedFontFamily;

            case "forceDark":
                return forceDark;

            case "geolocationEnabled":
                return geolocationEnabled;

            case "layoutAlgorithm":
                return layoutAlgorithm;

            case "loadWithOverviewMode":
                return loadWithOverviewMode;

            case "loadsImagesAutomatically":
                return loadsImagesAutomatically;

            case "minimumLogicalFontSize":
                return minimumLogicalFontSize;

            case "initialScale":
                return initialScale;

            case "needInitialFocus":
                return needInitialFocus;

            case "offscreenPreRaster":
                return offscreenPreRaster;

            case "sansSerifFontFamily":
                return sansSerifFontFamily;

            case "serifFontFamily":
                return serifFontFamily;

            case "standardFontFamily":
                return standardFontFamily;

            case "saveFormData":
                return saveFormData;

            case "thirdPartyCookiesEnabled":
                return thirdPartyCookiesEnabled;

            case "hardwareAcceleration":
                return hardwareAcceleration;

            case "supportMultipleWindows":
                return supportMultipleWindows;

            case "regexToCancelSubFramesLoading":
                return regexToCancelSubFramesLoading;

            default:
                return null;
        }
    }

    @Override
    public String[] getFieldList() {
        return new String[]{"useShouldOverrideUrlLoading",
                "useOnLoadResource",
                "useOnDownloadStart",
                "clearCache",
                "userAgent",
                "applicationNameForUserAgent",
                "javaScriptEnabled",
                "debuggingEnabled",
                "javaScriptCanOpenWindowsAutomatically",
                "mediaPlaybackRequiresUserGesture",
                "minimumFontSize",
                "verticalScrollBarEnabled",
                "horizontalScrollBarEnabled",
                "resourceCustomSchemes",
                "contentBlockers",
                "preferredContentMode",
                "useShouldInterceptAjaxRequest",
                "useShouldInterceptFetchRequest",
                "incognito",
                "cacheEnabled",
                "transparentBackground",
                "disableVerticalScroll",
                "disableHorizontalScroll",
                "textZoom",
                "clearSessionCache",
                "builtInZoomControls",
                "displayZoomControls",
                "supportZoom",
                "databaseEnabled",
                "domStorageEnabled",
                "useWideViewPort",
                "safeBrowsingEnabled",
                "mixedContentMode",
                "allowContentAccess",
                "allowFileAccess",
                "allowFileAccessFromFileURLs",
                "allowUniversalAccessFromFileURLs",
                "appCachePath",
                "blockNetworkImage",
                "blockNetworkLoads",
                "cacheMode",
                "cursiveFontFamily",
                "defaultFixedFontSize",
                "defaultFontSize",
                "defaultTextEncodingName",
                "disabledActionModeMenuItems",
                "fantasyFontFamily",
                "fixedFontFamily",
                "forceDark",
                "geolocationEnabled",
                "layoutAlgorithm",
                "loadWithOverviewMode",
                "loadsImagesAutomatically",
                "minimumLogicalFontSize",
                "initialScale",
                "needInitialFocus",
                "offscreenPreRaster",
                "sansSerifFontFamily",
                "serifFontFamily",
                "standardFontFamily",
                "saveFormData",
                "thirdPartyCookiesEnabled",
                "hardwareAcceleration",
                "supportMultipleWindows",
                "regexToCancelSubFramesLoading" };
    }

    private void setLayoutAlgorithm(Object value) {
        String strValue = (String) value;
        if (strValue != null) {
            switch (strValue) {
                case "NORMAL":
                    this.layoutAlgorithm = NORMAL;
                case "TEXT_AUTOSIZING":
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                        this.layoutAlgorithm = WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING;
                    } else {
                        layoutAlgorithm = NORMAL;
                    }
            }
        }
    }

//  @Override
//  public Object onParse(Map.Entry<String, Object> pair) {
//    if (pair.getKey().equals("layoutAlgorithm")) {
//      String value = (String) pair.getValue();
//      if (value != null) {
//        switch (value) {
//          case "NORMAL":
//            pair.setValue(NORMAL);
//            return pair;
//          case "TEXT_AUTOSIZING":
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//              return pair.setValue(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
//            } else {
//              pair.setValue(NORMAL);
//            }
//            return pair;
//        }
//      }
//    }
//    return super.onParse(pair);
//  }
//
//  @Override
//  public Object onGetHashMap(Field field) {
//    if (field.getName().equals("layoutAlgorithm")) {
//      try {
//        WebSettings.LayoutAlgorithm value = (WebSettings.LayoutAlgorithm) field.get(this);
//        if (value != null) {
//          switch (value) {
//            case NORMAL:
//              return "NORMAL";
//            default:
//              if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT && value.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING)) {
//                return "TEXT_AUTOSIZING";
//              }
//              return "NORMAL";
//          }
//        }
//      } catch (IllegalAccessException e) {
//        Log.d(LOG_TAG, e.getMessage());
//      }
//    }
//    return super.onGetHashMap(field);
//  }
}
