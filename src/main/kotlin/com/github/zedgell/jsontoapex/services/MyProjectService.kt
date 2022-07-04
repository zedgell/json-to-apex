package com.github.zedgell.jsontoapex.services

import com.intellij.openapi.project.Project
import com.github.zedgell.jsontoapex.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
