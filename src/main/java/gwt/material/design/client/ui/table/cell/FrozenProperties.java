/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.client.ui.table.cell;

import com.google.gwt.dom.client.Style;
import gwt.material.design.client.base.constants.StyleName;

import java.util.HashMap;
import java.util.Map;

public class FrozenProperties extends HashMap<StyleName, String> {

    private Map<StyleName, String> headerStyleProps = new HashMap<>();

    public FrozenProperties(String width, String headerHeight) {
        setStyleProperty(StyleName.WIDTH, width);
        setHeaderStyleProperty(StyleName.WIDTH, width);
        setHeaderStyleProperty(StyleName.HEIGHT, headerHeight);
    }

    /**
     * Set a style property using its name as the key. Please ensure the style name and value
     * are appropriately configured or it may result in unexpected behavior.
     *
     * @param styleName the style name as seen here {@link Style#STYLE_Z_INDEX} for example.
     * @param value the string value required for the given style property.
     */
    public FrozenProperties setStyleProperty(StyleName styleName, String value) {
        put(styleName, value);
        return this;
    }

    /**
     * Get a styles property.
     * @param styleName the styles name as represented in a {@link Style} class.
     * @return null if the style property is not set.
     */
    public String getStyleProperty(StyleName styleName) {
        return get(styleName);
    }

    /**
     * Set a header style property using its name as the key. Please ensure the style name and value
     * are appropriately configured or it may result in unexpected behavior.
     *
     * @param styleName the style name as seen here {@link Style#STYLE_Z_INDEX} for example.
     * @param value the string value required for the given style property.
     */
    public FrozenProperties setHeaderStyleProperty(StyleName styleName, String value) {
        headerStyleProps.put(styleName, value);
        return this;
    }

    public Map<StyleName, String> getHeaderStyleProperties() {
        return headerStyleProps;
    }

    /**
     * Get a header styles property.
     * @param styleName the styles name as represented in a {@link Style} class.
     * @return null if the style property is not set.
     */
    public String getHeaderStyleProperty(StyleName styleName) {
        return headerStyleProps.get(styleName);
    }
}
