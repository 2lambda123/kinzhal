package com.daugeldauge.kinzhal

import kotlin.reflect.KClass

@Retention(AnnotationRetention.SOURCE)
annotation class Component(val modules: Array<KClass<*>>)

@Retention(AnnotationRetention.SOURCE)
annotation class Inject

@Retention(AnnotationRetention.SOURCE)
annotation class Scope