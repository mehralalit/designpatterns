package edu.immune.sw.pattern.adapter;

/**
 * @author Lalit Mehra
 *
 */
public interface ConversionAdapter<I, O> {

	public O convert(I input);

}
