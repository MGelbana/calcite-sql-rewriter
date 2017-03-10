package io.pivotal.beach.calcite.programs;

import org.apache.calcite.adapter.jdbc.tools.JdbcRelBuilderFactory;
import org.apache.calcite.rel.RelNode;

public interface BasicForcedRule {
	RelNode apply(RelNode node, JdbcRelBuilderFactory relBuilderFactory);
}
