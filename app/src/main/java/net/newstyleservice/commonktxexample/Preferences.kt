package net.newstyleservice.commonktxexample

import android.content.Context
import net.newstyleservice.common_ktx.SharedPrefDelegated

class Preferences(context: Context) : SharedPrefDelegated(context) {
    var tapCounter: Long by pref(default = 0)
}