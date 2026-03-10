//
//  IOSLogger.swift
//  iosApp
//

import IOSApp

class IOSLogger : Logger {

    func log(message: String) {
        print("[iOS] \(message)")
    }
}
