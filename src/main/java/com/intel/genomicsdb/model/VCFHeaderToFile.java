/*
 * The MIT License (MIT)
 * Copyright (c) 2016-2018 Intel Corporation
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.intel.genomicsdb.model;

import htsjdk.variant.vcf.VCFHeader;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class VCFHeaderToFile {
    private List<VCFHeader> headers = new ArrayList<>();
    private ArrayList<String> sampleNames = new ArrayList<>();
    private Map<String, String> sampleNameToFileName = new LinkedHashMap<>();

    public VCFHeaderToFile(List<VCFHeader> headers, ArrayList<String> sampleNames, Map<String, String> sampleNameToFileName) {
        this.setHeaders(headers);
        this.setSampleNames(sampleNames);
        this.setSampleNameToFileName(sampleNameToFileName);
    }

    public List<VCFHeader> getHeaders() {
        return headers;
    }

    public void setHeaders(List<VCFHeader> headers) {
        this.headers = headers;
    }

    public ArrayList<String> getSampleNames() {
        return sampleNames;
    }

    public void setSampleNames(ArrayList<String> sampleNames) {
        this.sampleNames = sampleNames;
    }

    public Map<String, String> getSampleNameToFileName() {
        return sampleNameToFileName;
    }

    public void setSampleNameToFileName(Map<String, String> sampleNameToFileName) {
        this.sampleNameToFileName = sampleNameToFileName;
    }
}
