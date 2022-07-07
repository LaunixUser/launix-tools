/*
 * The MIT License
 *
 * Copyright 2019 Dr. Matthias Laux.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.ml.tools;

/**
 * A utility wrapper class for all classes that need to hold some form of
 * property data. 
 *
 * @author mlaux
 */
public class PropertyHolder {

    protected PropertyManager propertyManager;

    /**
     * The basic constructor
     *
     * @param propertyManager The property manager which contains all relevant
     * configuration data (if any such data is required)
     */
    public PropertyHolder(PropertyManager propertyManager) {
        if (propertyManager == null) {
            throw new IllegalArgumentException("propertyManager may not be null");
        }
        this.propertyManager = propertyManager;
    }

    /**
     *
     * @return
     */
    public PropertyManager getPropertyManager() {
        return propertyManager;
    }

}
