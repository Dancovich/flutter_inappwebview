//
//  InAppBrowserOptions.swift
//  flutter_inappwebview
//
//  Created by Lorenzo on 17/09/18.
//

import Foundation

@objcMembers
public class InAppBrowserOptions: Options {
    
    var hidden = false
    var toolbarTop = true
    var toolbarTopBackgroundColor = ""
    var toolbarTopFixedTitle = ""
    var hideUrlBar = false
    var toolbarBottom = true
    var toolbarBottomBackgroundColor = ""
    var toolbarBottomTranslucent = true
    var closeButtonCaption = ""
    var closeButtonColor = ""
    var presentationStyle = 0 //fullscreen
    var transitionStyle = 0 //crossDissolve
    var spinner = true
    
    override init(){
        super.init()
    }

    override func parse(options: [String: Any]) -> Options {
        for optionKey in options.keys {
            switch(optionKey) {
                case "hidden":
                    hidden = options[optionKey] as? Bool ?? hidden
                case "toolbarTop":
                    toolbarTop = options[optionKey] as? Bool ?? toolbarTop
                case "toolbarTopBackgroundColor":
                    toolbarTopBackgroundColor = options[optionKey] as? String ?? toolbarTopBackgroundColor
                case "toolbarTopFixedTitle":
                    toolbarTopFixedTitle = options[optionKey] as? String ?? toolbarTopFixedTitle
                case "hideUrlBar":
                    hideUrlBar = options[optionKey] as? Bool ?? hideUrlBar
                case "toolbarBottom":
                    toolbarBottom = options[optionKey] as? Bool ?? toolbarBottom
                case "toolbarBottomBackgroundColor":
                    toolbarBottomBackgroundColor = options[optionKey] as? String ?? toolbarBottomBackgroundColor
                case "toolbarBottomTranslucent":
                    toolbarBottomTranslucent = options[optionKey] as? Bool ?? toolbarBottomTranslucent
                case "closeButtonCaption":
                    closeButtonCaption = options[optionKey] as? String ?? closeButtonColor
                case "closeButtonColor":
                    closeButtonColor = options[optionKey] as? String ?? closeButtonColor
                case "presentationStyle":
                    presentationStyle = options[optionKey] as? Int ?? presentationStyle
                case "transitionStyle":
                    transitionStyle = options[optionKey] as? Int ?? transitionStyle
                case "spinner":
                    spinner = options[optionKey] as? Bool ?? spinner
            default:
                hidden = options["hidden"] as? Bool ?? hidden
            }
        }

        return self
    }

    override func getHashMap() -> [String: Any] {
        var options: [String: Any] = [:]
        
        options["hidden"] = hidden
        options["toolbarTop"] = toolbarTop
        options["toolbarTopBackgroundColor"] = toolbarTopBackgroundColor
        options["toolbarTopFixedTitle"] = toolbarTopFixedTitle
        options["hideUrlBar"] = hideUrlBar
        options["toolbarBottom"] = toolbarBottom
        options["toolbarBottomBackgroundColor"] = toolbarBottomBackgroundColor
        options["toolbarBottomTranslucent"] = toolbarBottomTranslucent
        options["closeButtonCaption"] = closeButtonCaption
        options["closeButtonColor"] = closeButtonColor
        options["presentationStyle"] = presentationStyle
        options["transitionStyle"] = transitionStyle
        options["spinner"] = spinner

        return options
    }
    
}
