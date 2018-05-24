package com.mobilejazz.kotlin.core.ext

import com.google.common.base.Throwables


fun Throwable.getStackTraceAsString() = Throwables.getStackTraceAsString(this)!!