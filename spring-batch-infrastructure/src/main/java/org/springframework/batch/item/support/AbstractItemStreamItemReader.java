/*
 * Copyright 2006-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.batch.item.support;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.ItemStreamSupport;

/**
 * Base class for {@link ItemReader} implementations.
 *
 * This abstract reader is thread-safe.
 *
 * @author Dave Syer
 * @author Mahmoud Ben Hassine
 *
 */
public abstract class AbstractItemStreamItemReader<T> extends ItemStreamSupport implements ItemStreamReader<T> {

}
