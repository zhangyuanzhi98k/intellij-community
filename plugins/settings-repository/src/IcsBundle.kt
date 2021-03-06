// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.jetbrains.settingsRepository

import com.intellij.DynamicBundle
import org.jetbrains.annotations.PropertyKey

private const val BUNDLE: String = "messages.IcsBundle"

object IcsBundle : DynamicBundle(BUNDLE) {
  @JvmStatic
  fun message(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any): String = getMessage(key, *params)

  @JvmStatic
  fun messagePointer(@PropertyKey(resourceBundle = BUNDLE) key: String,
                  vararg params: Any): java.util.function.Supplier<String> = getLazyMessage(key, *params)
}

fun icsMessage(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any): String {
  return IcsBundle.message(key, *params)
}
