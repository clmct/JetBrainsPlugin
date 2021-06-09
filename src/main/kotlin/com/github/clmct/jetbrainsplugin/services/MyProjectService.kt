package com.github.clmct.jetbrainsplugin.services

import com.github.clmct.jetbrainsplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
