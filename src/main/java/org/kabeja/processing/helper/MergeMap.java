/*
   Copyright 2008 Simon Mieth

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package org.kabeja.processing.helper;

import java.util.Collection;
import java.util.Map;
import java.util.Set;


public class MergeMap<K, V> implements Map<K, V> {
    private Map<K, V> base;
    private Map<K, V> override;

    public MergeMap(Map<K, V> base, Map<K, V> override) {
        this.base = base;
        this.override = override;
    }

    @Override
    public void clear() {
    }

    @Override
    public boolean containsKey(Object key) {
        if (this.override.containsKey(key)) {
            return true;
        } else {
            return this.base.containsKey(key);
        }
    }

    @Override
    public boolean containsValue(Object value) {
        if (this.override.containsValue(value)) {
            return true;
        } else {
            return this.base.containsValue(value);
        }
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return null;
    }

    @Override
    public V get(Object key) {
        V obj = this.override.get(key);

        if (obj == null) {
            obj = this.base.get(key);
        }

        return obj;
    }

    @Override
    public boolean isEmpty() {
        if (this.override.isEmpty()) {
            return true;
        } else {
            return this.base.isEmpty();
        }
    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public V put(K key, V value) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> arg0) {
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public int size() {
        return this.base.size();
    }

    @Override
    public Collection<V> values() {
        return null;
    }
}
