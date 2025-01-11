/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/android-client/blob/master/LICENSE.md
 */
package com.mifos.core.entity.zipmodels

import com.mifos.core.entity.accounts.ClientAccounts
import com.mifos.core.entity.client.Client

/**
 * Model for Observable.zip. This Model used to combine the Client and ClientAccount in response
 * of RxAndroid.
 * Created by Rajan Maurya on 01/07/16.
 */
class ClientAndClientAccounts {
    var client: Client? = null
    var clientAccounts: ClientAccounts? = null
}