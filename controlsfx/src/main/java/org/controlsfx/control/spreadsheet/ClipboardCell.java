/**
 * Copyright (c) 2018 ControlsFX
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met: *
 * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer. * Redistributions in binary
 * form must reproduce the above copyright notice, this list of conditions and
 * the following disclaimer in the documentation and/or other materials provided
 * with the distribution. * Neither the name of ControlsFX, any associated
 * website, nor the names of its contributors may be used to endorse or promote
 * products derived from this software without specific prior written
 * permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL CONTROLSFX BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.controlsfx.control.spreadsheet;

import java.io.Serializable;
import javafx.scene.input.Clipboard;

/**
 * This class will holds a cell value when we do a copy in the
 * {@link SpreadsheetView}.
 *
 * It is internally used by the {@link SpreadsheetView} but developpers may want
 * to tweak the behavior of retrieve the content of the {@link Clipboard}.
 *
 * @see SpreadsheetView
 */
public class ClipboardCell implements Serializable {

    private final int row;
    private final int column;
    private final Object value;

    /**
     * Constructor of a ClipboardCell for a cell.
     *
     * The value must be serializable.
     *
     * @param row the row of this {@code ClipboardCell}
     * @param column the column of this {@code ClipboardCell}
     * @param value the value of this {@code ClipboardCell}
     */
    public ClipboardCell(int row, int column, Object value) {
        this.row = row;
        this.column = column;
        this.value = value;
    }

    /**
     * Returns the row of this cell.
     *
     * @return the row of this cell.
     */
    public int getRow() {
        return row;
    }

    /**
     * Returns the column of this cell.
     *
     * @return the column of this cell.
     */
    public int getColumn() {
        return column;
    }

    /**
     * Returns the value of this cell.
     *
     * @return the value of this cell.
     */
    public Object getValue() {
        return value;
    }
}
