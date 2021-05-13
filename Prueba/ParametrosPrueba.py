import papermill as pm

pm.execute_notebook(
    './PruebaSimulacion.ipynb',
    './output.ipynb',
    parameters = dict(fecha_incio='2021-01-21',fecha_fin='2021-03-10')
)