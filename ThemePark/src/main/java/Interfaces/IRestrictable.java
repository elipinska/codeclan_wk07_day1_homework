package Interfaces;

import People.Visitor;

public interface IRestrictable {
        public Boolean isAllowedTo(Visitor visitor);
}
