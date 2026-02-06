package com.KovanLabs.Intern.EnumConcepts;
enum OrderState
{
    NEW{
        OrderState next(OrderState target)
        {
            if(target == PROCESSING)
            {
                return target;
            }
            throw new IllegalStateException("You can only move to Processing state");
        }
    },PROCESSING{
        OrderState next(OrderState target)
        {
            if(target == SHIPPED)
            {
                return target;
            }
            throw new IllegalStateException("You can only move to Shipping state ");
        }
},SHIPPED{
    @Override
    OrderState next(OrderState target) {
        if(target==DELIVERED)
        {
            return target;
        }
        throw new IllegalStateException("you can only move to deliver state");
    }
},DELIVERED{
    @Override
    OrderState next(OrderState target) {
        return target;
    }
};
    abstract OrderState next(OrderState target);
}
class Order
{
    private OrderState state;
    Order()
    {
        this.state=OrderState.NEW;
    }
    void moveState(OrderState newState)
    {
        state = state.next(newState);
        System.out.println("Order moved to "+state);
    }
    OrderState getState()
    {
        return state;
    }
}
public class StateMachine {
    public static void main(String[] args)
    {
        Order order = new Order();
        order.moveState(OrderState.PROCESSING);
        order.moveState(OrderState.SHIPPED);
        order.moveState(OrderState.DELIVERED);
    }
}
