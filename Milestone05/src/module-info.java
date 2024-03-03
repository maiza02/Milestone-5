/**
 *
 */
/**
 *
 */
module Milestone04 {
    requires com.fasterxml.jackson.databind;
    requires transitive com.fasterxml.jackson.core;
	requires java.desktop;
    opens Store to com.fasterxml.jackson.databind;
}

