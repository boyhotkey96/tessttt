//Cach 1:
LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
view = layoutInflater.inflate(R.layout.list_item, null);

//Cach 2:
LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
view = layoutInflater.inflate(R.layout.list_item, null);

//Cach 3:
/view = LayoutInflater.from(context).inflate(R.layout.list_item, null);
