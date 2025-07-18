package net.glasslauncher.gradleplugin.resourcegen

import net.glasslauncher.gradleplugin.resourcegen.ResourceGenPatternTargets.Companion.create
import org.gradle.api.Project
import org.gradle.api.provider.Property

open class ResourceGenExtension(project: Project) {
    val patternTargets: Property<ResourceGenPatternTargets> = project.objects.property<ResourceGenPatternTargets?>(ResourceGenPatternTargets::class.java)
        .convention(create())
}