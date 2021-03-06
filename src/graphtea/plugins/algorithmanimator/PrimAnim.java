// GraphTea Project: http://github.com/graphtheorysoftware/GraphTea
// Copyright (C) 2012 Graph Theory Software Foundation: http://GraphTheorySoftware.com
// Copyright (C) 2008 Mathematical Science Department of Sharif University of Technology
// Distributed under the terms of the GNU General Public License (GPL): http://www.gnu.org/licenses/
package graphtea.plugins.algorithmanimator;

import graphtea.library.BaseEdge;
import graphtea.library.BaseVertex;
import graphtea.library.algorithms.spanningtree.Prim;
import graphtea.plugins.algorithmanimator.extension.AlgorithmExtension;

public class PrimAnim
        extends Prim<BaseVertex, BaseEdge<BaseVertex>>
        implements AlgorithmExtension {

    public PrimAnim() {
        super(null, null);
    }

    public String getName() {
        return "Prim";
    }

    public String getDescription() {
        return "Prim Minimum Spanning Tree";
    }
}
