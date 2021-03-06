/**
 * Copyright 2017 Sun Jian
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.crazysunj.multitypeadapter.entity;

import java.util.List;

/**
 * 一开始的时候就这样设计了，懒得改了 - -！,分别获取个人感觉更人性化
 * Created by sunjian on 2017/3/27.
 */

public class LevelData<T> {

    private List<T> data;
    private T header;

    public LevelData(List<T> data, T header) {
        this.data = data;
        this.header = header;
    }

    public List<T> getData() {
        return data;
    }

    public T getHeader() {
        return header;
    }
}
