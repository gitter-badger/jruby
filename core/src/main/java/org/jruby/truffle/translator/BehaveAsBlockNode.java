/*
 * Copyright (c) 2014, 2015 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0
 * GNU General Public License version 2
 * GNU Lesser General Public License version 2.1
 */
package org.jruby.truffle.translator;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeCost;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.source.SourceSection;
import org.jruby.truffle.nodes.RubyNode;
import org.jruby.truffle.runtime.RubyContext;

@NodeInfo(cost = NodeCost.NONE)
public class BehaveAsBlockNode extends RubyNode {

    @Child protected RubyNode asBlockNode;
    @Child protected RubyNode asMethodNode;

    public BehaveAsBlockNode(RubyContext context, SourceSection sourceSection, RubyNode asBlockNode, RubyNode asMethodNode) {
        super(context, sourceSection);
        this.asBlockNode = asBlockNode;
        this.asMethodNode = asMethodNode;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        throw new UnsupportedOperationException();
    }

    public RubyNode getAsBlockNode() {
        return asBlockNode;
    }

    public RubyNode getAsMethodNode() {
        return asMethodNode;
    }

}
