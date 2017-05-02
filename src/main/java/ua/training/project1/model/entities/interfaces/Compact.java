package ua.training.project1.model.entities.interfaces;

public interface Compact extends Class{
	@Override
	default int getCapacity() {
		return COMPACT_CAPACITY;
	}
}
