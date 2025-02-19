/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/android-client/blob/master/LICENSE.md
 */
package com.mifos.core.objects.databaseobjects

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CollectionMeetingCalendar(
    var calendarInstanceId: Int = 0,

    var calendarId: Long = 0,

    var entityId: Int = 0,

    var entityType: EntityType? = null,

    var title: String? = null,

    var description: String? = null,

    var location: String? = null,

    var meetingCalendarDate: MeetingDate? = null,

    var isRepeating: Boolean = false,

    var recurrence: String? = null,

    var startDate: List<Int> = ArrayList(),
) : Parcelable
