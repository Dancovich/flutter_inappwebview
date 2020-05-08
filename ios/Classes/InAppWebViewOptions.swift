//
//  InAppWebViewOptions.swift
//  flutter_inappwebview
//
//  Created by Lorenzo on 21/10/18.
//

import Foundation
import WebKit

@objcMembers
public class InAppWebViewOptions: Options {
    
    var useShouldOverrideUrlLoading = false
    var useOnLoadResource = false
    var useOnDownloadStart = false
    var clearCache = false
    var userAgent = ""
    var applicationNameForUserAgent = ""
    var javaScriptEnabled = true
    var debuggingEnabled = true
    var javaScriptCanOpenWindowsAutomatically = false
    var mediaPlaybackRequiresUserGesture = true
    var verticalScrollBarEnabled = true
    var horizontalScrollBarEnabled = true
    var resourceCustomSchemes: [String] = []
    var contentBlockers: [[String: [String : Any]]] = []
    var minimumFontSize = 0
    var useShouldInterceptAjaxRequest = false
    var useShouldInterceptFetchRequest = false
    var incognito = false
    var cacheEnabled = true
    var transparentBackground = false
    var disableVerticalScroll = false
    var disableHorizontalScroll = false
    var disallowOverScroll = false
    var enableViewportScale = false
    var suppressesIncrementalRendering = false
    var allowsAirPlayForMediaPlayback = true
    var allowsBackForwardNavigationGestures = true
    var allowsLinkPreview = true
    var ignoresViewportScaleLimits = false
    var allowsInlineMediaPlayback = false
    var allowsPictureInPictureMediaPlayback = true
    var isFraudulentWebsiteWarningEnabled = true;
    var selectionGranularity = 0;
    var dataDetectorTypes: [String] = ["NONE"] // WKDataDetectorTypeNone
    var preferredContentMode = 0
    var sharedCookiesEnabled = false
    var automaticallyAdjustsScrollIndicatorInsets = false
    
    override init(){
        super.init()
    }

    override func parse(options: [String: Any]) -> Options {
        for optionKey in options.keys {
            switch(optionKey) {
                case "useShouldOverrideUrlLoading":
                    useShouldOverrideUrlLoading = options[optionKey] as? Bool ?? useShouldOverrideUrlLoading
                case "useOnLoadResource":
                    useOnLoadResource = options[optionKey] as? Bool ?? useOnLoadResource
                case "useOnDownloadStart":
                    useOnDownloadStart = options[optionKey] as? Bool ?? useOnDownloadStart
                case "clearCache":
                    clearCache = options[optionKey] as? Bool ?? clearCache
                case "userAgent":
                    userAgent = options[optionKey] as? String ?? userAgent
                case "applicationNameForUserAgent":
                    applicationNameForUserAgent = options[optionKey] as? String ?? applicationNameForUserAgent
                case "javaScriptEnabled":
                    javaScriptEnabled = options[optionKey] as? Bool ?? javaScriptEnabled
                case "debuggingEnabled":
                    debuggingEnabled = options[optionKey] as? Bool ?? debuggingEnabled
                case "javaScriptCanOpenWindowsAutomatically":
                    javaScriptCanOpenWindowsAutomatically = options[optionKey] as? Bool ?? javaScriptCanOpenWindowsAutomatically
                case "mediaPlaybackRequiresUserGesture":
                    mediaPlaybackRequiresUserGesture = options[optionKey] as? Bool ?? mediaPlaybackRequiresUserGesture
                case "verticalScrollBarEnabled":
                    verticalScrollBarEnabled = options[optionKey] as? Bool ?? verticalScrollBarEnabled
                case "horizontalScrollBarEnabled":
                    horizontalScrollBarEnabled = options[optionKey] as? Bool ?? horizontalScrollBarEnabled
                case "resourceCustomSchemes":
                    resourceCustomSchemes = options[optionKey] as? [String] ?? resourceCustomSchemes
                case "contentBlockers":
                    contentBlockers = options[optionKey] as? [[String: [String : Any]]] ?? contentBlockers
                case "minimumFontSize":
                    minimumFontSize = options[optionKey] as? Int ?? minimumFontSize
                case "useShouldInterceptAjaxRequest":
                    useShouldInterceptAjaxRequest = options[optionKey] as? Bool ?? useShouldInterceptAjaxRequest
                case "useShouldInterceptFetchRequest":
                    useShouldInterceptFetchRequest = options[optionKey] as? Bool ?? useShouldInterceptFetchRequest
                case "incognito":
                    incognito = options[optionKey] as? Bool ?? incognito
                case "cacheEnabled":
                    cacheEnabled = options[optionKey] as? Bool ?? cacheEnabled
                case "transparentBackground":
                    transparentBackground = options[optionKey] as? Bool ?? transparentBackground
                case "disableVerticalScroll":
                    disableVerticalScroll = options[optionKey] as? Bool ?? disableVerticalScroll
                case "disableHorizontalScroll":
                    disableHorizontalScroll = options[optionKey] as? Bool ?? disableHorizontalScroll
                case "disallowOverScroll":
                    disallowOverScroll = options[optionKey] as? Bool ?? disallowOverScroll
                case "enableViewportScale":
                    enableViewportScale = options[optionKey] as? Bool ?? enableViewportScale
                case "suppressesIncrementalRendering":
                    suppressesIncrementalRendering = options[optionKey] as? Bool ?? suppressesIncrementalRendering
                case "allowsAirPlayForMediaPlayback":
                    allowsAirPlayForMediaPlayback = options[optionKey] as? Bool ?? allowsAirPlayForMediaPlayback
                case "allowsBackForwardNavigationGestures":
                    allowsBackForwardNavigationGestures = options[optionKey] as? Bool ?? allowsBackForwardNavigationGestures
                case "allowsLinkPreview":
                    allowsLinkPreview = options[optionKey] as? Bool ?? allowsLinkPreview
                case "ignoresViewportScaleLimits":
                    ignoresViewportScaleLimits = options[optionKey] as? Bool ?? ignoresViewportScaleLimits
                case "allowsInlineMediaPlayback":
                    allowsInlineMediaPlayback = options[optionKey] as? Bool ?? allowsInlineMediaPlayback
                case "allowsPictureInPictureMediaPlayback":
                    allowsPictureInPictureMediaPlayback = options[optionKey] as? Bool ?? allowsPictureInPictureMediaPlayback
                case "isFraudulentWebsiteWarningEnabled":
                    isFraudulentWebsiteWarningEnabled = options[optionKey] as? Bool ?? isFraudulentWebsiteWarningEnabled
                case "selectionGranularity":
                    selectionGranularity = options[optionKey] as? Int ?? selectionGranularity
                case "dataDetectorTypes":
                    dataDetectorTypes = options[optionKey] as? [String] ?? dataDetectorTypes
                case "preferredContentMode":
                    preferredContentMode = options[optionKey] as? Int ?? preferredContentMode
                case "sharedCookiesEnabled":
                    sharedCookiesEnabled = options[optionKey] as? Bool ?? sharedCookiesEnabled
                case "automaticallyAdjustsScrollIndicatorInsets":
                    automaticallyAdjustsScrollIndicatorInsets = options[optionKey] as? Bool ?? automaticallyAdjustsScrollIndicatorInsets
            default:
                useShouldOverrideUrlLoading = options["useShouldOverrideUrlLoading"] as? Bool ?? useShouldOverrideUrlLoading
            }
        }

        return self
    }

    override func getHashMap() -> [String: Any] {
        var options: [String: Any] = [:]

        options["useShouldOverrideUrlLoading"] = useShouldOverrideUrlLoading
        options["useOnLoadResource"] = useOnLoadResource
        options["useOnDownloadStart"] = useOnDownloadStart
        options["clearCache"] = clearCache
        options["userAgent"] = userAgent
        options["applicationNameForUserAgent"] = applicationNameForUserAgent
        options["javaScriptEnabled"] = javaScriptEnabled
        options["debuggingEnabled"] = debuggingEnabled
        options["javaScriptCanOpenWindowsAutomatically"] = javaScriptCanOpenWindowsAutomatically
        options["mediaPlaybackRequiresUserGesture"] = mediaPlaybackRequiresUserGesture
        options["verticalScrollBarEnabled"] = verticalScrollBarEnabled
        options["horizontalScrollBarEnabled"] = horizontalScrollBarEnabled
        options["resourceCustomSchemes"] = resourceCustomSchemes
        options["contentBlockers"] = contentBlockers
        options["minimumFontSize"] = minimumFontSize
        options["useShouldInterceptAjaxRequest"] = useShouldInterceptAjaxRequest
        options["useShouldInterceptFetchRequest"] = useShouldInterceptFetchRequest
        options["incognito"] = incognito
        options["cacheEnabled"] = cacheEnabled
        options["transparentBackground"] = transparentBackground
        options["disableVerticalScroll"] = disableVerticalScroll
        options["disableHorizontalScroll"] = disableHorizontalScroll
        options["disallowOverScroll"] = disallowOverScroll
        options["enableViewportScale"] = enableViewportScale
        options["suppressesIncrementalRendering"] = suppressesIncrementalRendering
        options["allowsAirPlayForMediaPlayback"] = allowsAirPlayForMediaPlayback
        options["allowsBackForwardNavigationGestures"] = allowsBackForwardNavigationGestures
        options["allowsLinkPreview"] = allowsLinkPreview
        options["ignoresViewportScaleLimits"] = ignoresViewportScaleLimits
        options["allowsInlineMediaPlayback"] = allowsInlineMediaPlayback
        options["allowsPictureInPictureMediaPlayback"] = allowsPictureInPictureMediaPlayback
        options["isFraudulentWebsiteWarningEnabled"] = isFraudulentWebsiteWarningEnabled
        options["selectionGranularity"] = selectionGranularity
        options["dataDetectorTypes"] = dataDetectorTypes
        options["preferredContentMode"] = preferredContentMode
        options["sharedCookiesEnabled"] = sharedCookiesEnabled
        options["automaticallyAdjustsScrollIndicatorInsets"] = automaticallyAdjustsScrollIndicatorInsets

        return options
    }
}
