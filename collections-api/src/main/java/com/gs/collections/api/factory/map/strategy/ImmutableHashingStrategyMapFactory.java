/*
 * Copyright 2011 Goldman Sachs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gs.collections.api.factory.map.strategy;

import java.util.Map;

import com.gs.collections.api.block.HashingStrategy;
import com.gs.collections.api.map.ImmutableMap;

public interface ImmutableHashingStrategyMapFactory
{
    /**
     * Same as {@link #with(HashingStrategy)}.
     */
    <K, V> ImmutableMap<K, V> of(HashingStrategy<? super K> hashingStrategy);

    <K, V> ImmutableMap<K, V> with(HashingStrategy<? super K> hashingStrategy);

    /**
     * Same as {@link #with(com.gs.collections.api.block.HashingStrategy, Object, Object)}.
     */
    <K, V> ImmutableMap<K, V> of(HashingStrategy<? super K> hashingStrategy, K key, V value);

    <K, V> ImmutableMap<K, V> with(HashingStrategy<? super K> hashingStrategy, K key, V value);

    /**
     * Same as {@link #with(com.gs.collections.api.block.HashingStrategy, Object, Object, Object, Object)}.
     */
    <K, V> ImmutableMap<K, V> of(HashingStrategy<? super K> hashingStrategy, K key1, V value1, K key2, V value2);

    <K, V> ImmutableMap<K, V> with(HashingStrategy<? super K> hashingStrategy, K key1, V value1, K key2, V value2);

    /**
     * Same as {@link #with(com.gs.collections.api.block.HashingStrategy, Object, Object, Object, Object, Object, Object)}.
     */
    <K, V> ImmutableMap<K, V> of(
            HashingStrategy<? super K> hashingStrategy,
            K key1, V value1,
            K key2, V value2,
            K key3, V value3);

    <K, V> ImmutableMap<K, V> with(
            HashingStrategy<? super K> hashingStrategy,
            K key1, V value1,
            K key2, V value2,
            K key3, V value3);

    /**
     * Same as {@link #with(com.gs.collections.api.block.HashingStrategy, Object, Object, Object, Object, Object, Object, Object, Object)}.
     */
    <K, V> ImmutableMap<K, V> of(
            HashingStrategy<? super K> hashingStrategy,
            K key1, V value1,
            K key2, V value2,
            K key3, V value3,
            K key4, V value4);

    <K, V> ImmutableMap<K, V> with(
            HashingStrategy<? super K> hashingStrategy,
            K key1, V value1,
            K key2, V value2,
            K key3, V value3,
            K key4, V value4);

    <K, V> ImmutableMap<K, V> ofMap(Map<K, V> map);

    /**
     * Same as {@link #withAll(Map)}.
     */
    <K, V> ImmutableMap<K, V> ofAll(Map<K, V> map);

    <K, V> ImmutableMap<K, V> withAll(Map<K, V> map);
}
