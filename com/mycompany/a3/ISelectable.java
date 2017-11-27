package com.mycompany.a3;

import com.codename1.charts.models.Point;
import com.codename1.ui.Graphics;

public interface ISelectable {
		public void setSelected(boolean yesNo);
		public boolean isSelected();
		public boolean contains(Point pPtrRelPrnt, Point pCmpRelPrnt);

		public void setLocation(int x, int y);
	}
