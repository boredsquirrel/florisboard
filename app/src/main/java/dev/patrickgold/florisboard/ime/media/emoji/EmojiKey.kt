/*
 * Copyright (C) 2021 Patrick Goldinger
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.patrickgold.florisboard.ime.media.emoji

import dev.patrickgold.florisboard.ime.keyboard.Key
import dev.patrickgold.florisboard.ime.keyboard.KeyData
import dev.patrickgold.florisboard.ime.popup.PopupSet

class EmojiKey(override val data: KeyData) : Key(data) {
    var computedData: EmojiKeyData = EmojiKeyData(listOf())
        private set
    var computedPopups: PopupSet<EmojiKeyData> = PopupSet()
        private set

    fun dummyCompute() {
        computedData = data as? EmojiKeyData ?: computedData
        computedPopups = PopupSet(relevant = (data as? EmojiKeyData)?.popup ?: listOf())
    }
}
