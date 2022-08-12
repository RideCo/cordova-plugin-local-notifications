/*
 * Apache 2.0 License
 *
 * Copyright (c) Sebastian Katzer 2017
 *
 * This file contains Original Code and/or Modifications of Original Code
 * as defined in and that are subject to the Apache License
 * Version 2.0 (the 'License'). You may not use this file except in
 * compliance with the License. Please obtain a copy of the License at
 * http://opensource.org/licenses/Apache-2.0/ and read it before using this
 * file.
 *
 * The Original Code and all software distributed under the License are
 * distributed on an 'AS IS' basis, WITHOUT WARRANTY OF ANY KIND, EITHER
 * EXPRESS OR IMPLIED, AND APPLE HEREBY DISCLAIMS ALL SUCH WARRANTIES,
 * INCLUDING WITHOUT LIMITATION, ANY WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE, QUIET ENJOYMENT OR NON-INFRINGEMENT.
 * Please see the License for the specific language governing rights and
 * limitations under the License.
 */

package de.appplant.cordova.plugin.notification.util;

import android.app.PendingIntent;

/**
 * Util class to obtain the most appropriate PendingIntent flag based on
 * Build SDK_INT version.
 */
public class PendingIntentUtil {

    /**
     * Return the Pending Intent appropriate flag.
     *
     * @param flag The current flag being used.
     */
    public static int getPendingIntentFlag(int flag) {
        int pendingIntentValueFLAG = flag;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.S) {
            pendingIntentValueFLAG = pendingIntentValueFLAG | PendingIntent.FLAG_IMMUTABLE;
        }
        return pendingIntentValueFLAG;
    }
}
