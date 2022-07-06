/*
 * Spatial is a spatial api for Java...
 * Copyright (c) 2021 Arcane Arts
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package art.arcane.spatial.matter.slices;


import art.arcane.spatial.container.Palette;
import art.arcane.spatial.matter.Sliced;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

@Sliced
public class FloatMatter extends RawMatter<Float> {
    public FloatMatter() {
        this(1, 1, 1);
    }

    @Override
    public Palette<Float> getGlobalPalette() {
        return null;
    }

    public FloatMatter(int width, int height, int depth) {
        super(width, height, depth, Float.class);
    }

    @Override
    public void writeNode(Float b, DataOutputStream dos) throws IOException {
        dos.writeFloat(b);
    }

    @Override
    public Float readNode(DataInputStream din) throws IOException {
        return din.readFloat();
    }
}
